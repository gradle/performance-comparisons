package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_323 {
    private final Production34_323 production = new Production34_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}