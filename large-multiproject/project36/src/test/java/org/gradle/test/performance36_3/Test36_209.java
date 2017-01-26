package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_209 {
    private final Production36_209 production = new Production36_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}