package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_445 {
    private final Production36_445 production = new Production36_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}