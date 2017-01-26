package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_377 {
    private final Production19_377 production = new Production19_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}