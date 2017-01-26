package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_498 {
    private final Production34_498 production = new Production34_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}