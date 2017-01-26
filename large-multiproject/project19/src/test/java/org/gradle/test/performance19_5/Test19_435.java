package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_435 {
    private final Production19_435 production = new Production19_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}