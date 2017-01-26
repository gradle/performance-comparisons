package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_358 {
    private final Production33_358 production = new Production33_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}