package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_255 {
    private final Production36_255 production = new Production36_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}