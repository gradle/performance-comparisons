package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_461 {
    private final Production85_461 production = new Production85_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}