package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_85 {
    private final Production79_85 production = new Production79_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}