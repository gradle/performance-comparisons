package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_461 {
    private final Production52_461 production = new Production52_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}