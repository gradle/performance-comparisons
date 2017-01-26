package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_377 {
    private final Production34_377 production = new Production34_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}