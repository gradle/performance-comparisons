package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_471 {
    private final Production34_471 production = new Production34_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}