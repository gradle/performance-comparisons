package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_214 {
    private final Production36_214 production = new Production36_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}