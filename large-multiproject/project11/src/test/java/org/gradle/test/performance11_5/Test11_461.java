package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_461 {
    private final Production11_461 production = new Production11_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}