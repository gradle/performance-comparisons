package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_167 {
    private final Production36_167 production = new Production36_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}