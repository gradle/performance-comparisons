package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_444 {
    private final Production36_444 production = new Production36_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}