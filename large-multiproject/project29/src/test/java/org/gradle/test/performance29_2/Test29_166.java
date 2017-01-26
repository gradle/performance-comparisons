package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_166 {
    private final Production29_166 production = new Production29_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}