package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_255 {
    private final Production45_255 production = new Production45_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}