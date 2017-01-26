package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_424 {
    private final Production19_424 production = new Production19_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}