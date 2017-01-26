package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_293 {
    private final Production34_293 production = new Production34_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}