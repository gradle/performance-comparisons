package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_419 {
    private final Production34_419 production = new Production34_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}