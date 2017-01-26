package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_76 {
    private final Production78_76 production = new Production78_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}