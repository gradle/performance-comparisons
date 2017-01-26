package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_294 {
    private final Production34_294 production = new Production34_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}