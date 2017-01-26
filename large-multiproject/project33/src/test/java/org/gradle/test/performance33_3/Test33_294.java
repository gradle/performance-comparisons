package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_294 {
    private final Production33_294 production = new Production33_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}