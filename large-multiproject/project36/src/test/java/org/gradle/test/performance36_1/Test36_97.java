package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_97 {
    private final Production36_97 production = new Production36_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}