package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_297 {
    private final Production85_297 production = new Production85_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}