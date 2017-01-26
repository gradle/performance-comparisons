package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_259 {
    private final Production59_259 production = new Production59_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}