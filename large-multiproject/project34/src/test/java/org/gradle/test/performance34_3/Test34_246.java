package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_246 {
    private final Production34_246 production = new Production34_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}