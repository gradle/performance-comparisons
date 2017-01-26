package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_388 {
    private final Production34_388 production = new Production34_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}