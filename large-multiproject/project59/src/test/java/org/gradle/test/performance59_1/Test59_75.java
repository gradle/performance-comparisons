package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_75 {
    private final Production59_75 production = new Production59_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}