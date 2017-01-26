package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_183 {
    private final Production36_183 production = new Production36_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}