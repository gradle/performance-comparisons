package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_461 {
    private final Production19_461 production = new Production19_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}