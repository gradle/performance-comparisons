package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_461 {
    private final Production2_461 production = new Production2_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}