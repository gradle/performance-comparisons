package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_38 {
    private final Production59_38 production = new Production59_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}