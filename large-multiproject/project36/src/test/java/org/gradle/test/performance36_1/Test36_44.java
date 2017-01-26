package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_44 {
    private final Production36_44 production = new Production36_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}