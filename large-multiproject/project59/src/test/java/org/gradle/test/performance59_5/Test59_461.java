package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_461 {
    private final Production59_461 production = new Production59_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}