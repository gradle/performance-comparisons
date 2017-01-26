package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_461 {
    private final Production34_461 production = new Production34_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}