package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_268 {
    private final Production34_268 production = new Production34_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}