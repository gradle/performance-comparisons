package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_288 {
    private final Production36_288 production = new Production36_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}