package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_297 {
    private final Production34_297 production = new Production34_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}