package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_168 {
    private final Production29_168 production = new Production29_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}