package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_331 {
    private final Production36_331 production = new Production36_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}