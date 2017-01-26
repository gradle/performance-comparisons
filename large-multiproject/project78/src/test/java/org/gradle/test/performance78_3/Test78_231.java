package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_231 {
    private final Production78_231 production = new Production78_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}