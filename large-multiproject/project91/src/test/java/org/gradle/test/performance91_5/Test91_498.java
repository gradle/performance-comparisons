package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_498 {
    private final Production91_498 production = new Production91_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}