package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_461 {
    private final Production91_461 production = new Production91_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}