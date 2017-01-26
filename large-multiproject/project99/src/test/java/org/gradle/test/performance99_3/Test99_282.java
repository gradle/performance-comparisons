package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_282 {
    private final Production99_282 production = new Production99_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}