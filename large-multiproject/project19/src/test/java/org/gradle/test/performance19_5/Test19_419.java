package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_419 {
    private final Production19_419 production = new Production19_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}