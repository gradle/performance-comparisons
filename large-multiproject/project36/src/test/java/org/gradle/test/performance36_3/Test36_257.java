package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_257 {
    private final Production36_257 production = new Production36_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}