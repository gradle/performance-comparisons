package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_106 {
    private final Production59_106 production = new Production59_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}