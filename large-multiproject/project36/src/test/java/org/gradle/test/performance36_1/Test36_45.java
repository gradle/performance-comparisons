package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_45 {
    private final Production36_45 production = new Production36_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}