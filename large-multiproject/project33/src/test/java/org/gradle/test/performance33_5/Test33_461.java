package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_461 {
    private final Production33_461 production = new Production33_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}