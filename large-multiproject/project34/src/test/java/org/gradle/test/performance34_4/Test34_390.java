package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_390 {
    private final Production34_390 production = new Production34_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}