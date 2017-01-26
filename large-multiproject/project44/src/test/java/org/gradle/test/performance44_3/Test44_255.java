package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_255 {
    private final Production44_255 production = new Production44_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}