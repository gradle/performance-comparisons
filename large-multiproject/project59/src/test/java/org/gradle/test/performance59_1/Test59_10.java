package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_10 {
    private final Production59_10 production = new Production59_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}