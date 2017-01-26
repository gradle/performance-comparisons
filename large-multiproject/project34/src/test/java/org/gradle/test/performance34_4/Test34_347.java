package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_347 {
    private final Production34_347 production = new Production34_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}