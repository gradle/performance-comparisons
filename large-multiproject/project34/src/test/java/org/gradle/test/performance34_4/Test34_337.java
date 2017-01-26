package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_337 {
    private final Production34_337 production = new Production34_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}