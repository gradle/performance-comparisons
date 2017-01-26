package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_93 {
    private final Production36_93 production = new Production36_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}